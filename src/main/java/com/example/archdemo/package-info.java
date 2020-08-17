/**
 * this is a demo application that demonstrates my architectural ideas
 *
 * the entire system has 3 services: article, consumer and notify
 *
 * the article has CRUD for article, and issue a new event on new article
 * the consumer service accepts the event, and invoke notify service's NotifyService
 * the notify service then send email to all users
 */
package com.example.archdemo;