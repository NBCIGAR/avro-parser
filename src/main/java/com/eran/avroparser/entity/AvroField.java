package com.eran.avroparser.entity;

import lombok.Data;
import lombok.experimental.Wither;

@Data
@Wither
public class AvroField {

    String type;

    String name;

    String nameSpace;

    String doc;

    String defaultValue;

}
