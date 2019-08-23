package com.eran.avroparser.entity;

import lombok.Data;
import lombok.experimental.Wither;

import java.util.List;

@Data
@Wither
public class AvroRecord {

    String type;

    String name;

    String nameSpace;

    String doc;

    String defaultValue;

    List<AvroField> avroFieldList;


}
