package com.eran.avroparser;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("avroParser")
public class AvroRestController {

    @PostMapping(path = "/", produces = "application/json")
    public String parseAvroSchema(@RequestBody String schema) {
        System.out.println("parseAvroSchema");
        System.out.println(schema);
        return schema;

    }


}
