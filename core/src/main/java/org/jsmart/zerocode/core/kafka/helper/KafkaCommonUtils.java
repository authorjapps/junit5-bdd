package org.jsmart.zerocode.core.kafka.helper;

import static java.lang.String.format;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class KafkaCommonUtils {
  private static final Logger LOGGER = LoggerFactory.getLogger(KafkaConsumerHelper.class);

  public static void printBrokerProperties(String kafkaServers) {

    LOGGER.info(
        "\n---------------------------------------------------------\n"
            + format("kafka.bootstrap.servers - %s", kafkaServers)
            + "\n---------------------------------------------------------");
  }
}