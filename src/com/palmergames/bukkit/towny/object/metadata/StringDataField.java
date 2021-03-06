package com.palmergames.bukkit.towny.object.metadata;

public class StringDataField extends CustomDataField<String> {

    public StringDataField(String key) {
        super(key, CustomDataFieldType.StringField);
    }
    
    public StringDataField(String key, String value) {
        super(key, CustomDataFieldType.StringField, value);
    }
}
