package com.example.common.behaviour;

import com.fasterxml.jackson.annotation.JsonProperty;

public interface Sound {
    @JsonProperty
    String sound();
}
