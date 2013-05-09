package com.nolanlawson.jnameconverter.server;

import java.io.BufferedInputStream;
import java.io.InputStream;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;

import com.nolanlawson.japanesenamegenerator.v3.JapaneseNameGenerator;
import com.nolanlawson.japanesenamegenerator.v3.util.Pair;

@Path("/convert")
public class JapaneseNameConverterService {

    private JapaneseNameGenerator japaneseNameGenerator = buildJapanesenameGenerator();

    @GET
    @Path("/")
    @Produces(MediaType.APPLICATION_JSON + ";charset=utf-8")
    public ConversionResult getMsg(@QueryParam("q") String query) {

        try {
            Pair<String, String> result = japaneseNameGenerator.convertToRomaajiAndKatakana(query);
            return new ConversionResult(false, result.getFirst(), result.getSecond());
        } catch (Throwable t) {
            t.printStackTrace();
            return new ConversionResult(true, null, null);
        }
    }

    private JapaneseNameGenerator buildJapanesenameGenerator() {

        System.out.println("instantiating japanese name converter...");

        InputStream roomajiInputStream = new BufferedInputStream(getClass().getClassLoader().getResourceAsStream(
                "roomaji_model_20090128_pop1_3_3_min2_fewer_rules_hacked.txt"));

        InputStream directLookupInputstream = new BufferedInputStream(getClass().getClassLoader().getResourceAsStream(
                "all_names.txt"));

        return new JapaneseNameGenerator(roomajiInputStream, directLookupInputstream);

    }

}
