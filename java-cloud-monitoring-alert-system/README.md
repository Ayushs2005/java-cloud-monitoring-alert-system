# Java-Based Cloud Monitoring Alert System

A serverless cloud monitoring and alerting system built using AWS and Java.

## Architecture
CloudWatch Alarm → AWS Lambda (Java) → Amazon SNS → Email Notification

## Tech Stack
- Java 11
- AWS Lambda
- Amazon SNS
- AWS CloudWatch
- Maven

## Features
- Event-driven serverless architecture
- Automated email alerts
- Scalable and cost-efficient design

## How It Works
1. CloudWatch alarm is triggered
2. Lambda function executes
3. SNS sends an email notification

## Deployment
- Build the project using: `mvn clean package`
- Upload the generated JAR to AWS Lambda
- Set handler:
  `com.cloud.monitoring.AlertHandler::handleRequest`
- Attach `AmazonSNSFullAccess` permission

## Notes
- Replace `YOUR_SNS_TOPIC_ARN_HERE` before deployment
- AWS credentials should never be committed to GitHub
