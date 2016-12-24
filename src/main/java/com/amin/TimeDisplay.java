package com.amin;

import javax.ws.rs.GET;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import java.util.Calendar;
import javax.ws.rs.Path;

@Path("/time")
public class TimeDisplay {

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public String getDate() {
        StringBuffer res = new StringBuffer();
        Calendar c = Calendar.getInstance();
        res.append("{\"day\" : ").append(c.get(Calendar.DAY_OF_MONTH)).append(", ").
                append("\"month\" : ").append(c.get(Calendar.MONTH)).append(", ").
                append("\"year\" : ").append(c.get(Calendar.YEAR)).append(", ").
                append("\"hour\" : ").append(c.get(Calendar.HOUR_OF_DAY)).append(", ").
                append("\"minute\" : ").append(c.get(Calendar.MINUTE)).append(", ").
                append("\"second\" : ").append(c.get(Calendar.SECOND)).append("}");
        return res.toString();
    }
}

