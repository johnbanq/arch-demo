/**
 * infra package
 *
 * we deals with database / external service / MQ access here
 *
 * place all your DAO into the db package
 * all event publisher into the mq package
 * all external service call into the service package
 *
 * and let domain package call them!
 */
package com.example.archdemo.notify.infra;