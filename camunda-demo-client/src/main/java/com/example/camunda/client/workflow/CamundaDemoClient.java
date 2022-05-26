package com.example.camunda.client.workflow;

import org.camunda.bpm.client.spring.annotation.ExternalTaskSubscription;
import org.camunda.bpm.client.task.ExternalTask;
import org.camunda.bpm.client.task.ExternalTaskHandler;
import org.camunda.bpm.client.task.ExternalTaskService;
import org.springframework.context.annotation.Configuration;

/**
 * 流程客户端方法
 *
 * @author : liugang
 * @date : 2022/5/26 14:51
 */
@Configuration
@ExternalTaskSubscription(topicName = "topic.task")
public class CamundaDemoClient implements ExternalTaskHandler {

    @Override
    public void execute(ExternalTask externalTask, ExternalTaskService externalTaskService) {
        // 业务方法
        System.out.println("task finished");
        // 完成任务
        externalTaskService.complete(externalTask);
    }
}
