package com.cloud.monitoring;

import com.amazonaws.services.lambda.runtime.Context;
import com.amazonaws.services.lambda.runtime.RequestHandler;
import com.amazonaws.services.sns.AmazonSNS;
import com.amazonaws.services.sns.AmazonSNSClientBuilder;
import com.amazonaws.services.sns.model.PublishRequest;

import java.util.Map;

public class AlertHandler implements RequestHandler<Map<String, Object>, String> {

    private static final String SNS_TOPIC_ARN = "SNS_TOPIC_ARN_HERE";

    @Override
    public String handleRequest(Map<String, Object> event, Context context) {

        AmazonSNS sns = AmazonSNSClientBuilder.standard()
                .withRegion("ap-south-1")
                .build();

        sns.publish(new PublishRequest()
                .withTopicArn(SNS_TOPIC_ARN)
                .withSubject("Cloud Alert")
                .withMessage("AWS CloudWatch alarm triggered"));

        return "Alert sent successfully";
    }
}
