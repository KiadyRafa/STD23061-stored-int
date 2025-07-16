package com.storedint.demo.conf;

import com.storedint.demo.PojaGenerated;
import org.springframework.test.context.DynamicPropertyRegistry;

@PojaGenerated
public class EmailConf {

  void configureProperties(DynamicPropertyRegistry registry) {
    registry.add("aws.ses.source", () -> "dummy-ses-source");
  }
}
