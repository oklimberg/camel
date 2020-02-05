/* Generated by camel build tools - do NOT edit this file! */
package org.apache.camel.component.google.calendar.stream;

import org.apache.camel.CamelContext;
import org.apache.camel.spi.GeneratedPropertyConfigurer;
import org.apache.camel.support.component.PropertyConfigurerSupport;

/**
 * Generated by camel build tools - do NOT edit this file!
 */
@SuppressWarnings("unchecked")
public class GoogleCalendarStreamEndpointConfigurer extends PropertyConfigurerSupport implements GeneratedPropertyConfigurer {

    @Override
    public boolean configure(CamelContext camelContext, Object target, String name, Object value, boolean ignoreCase) {
        if (ignoreCase) {
            return doConfigureIgnoreCase(camelContext, target, name, value);
        } else {
            return doConfigure(camelContext, target, name, value);
        }
    }

    private static boolean doConfigure(CamelContext camelContext, Object target, String name, Object value) {
        switch (name) {
        case "accessToken": ((GoogleCalendarStreamEndpoint) target).getConfiguration().setAccessToken(property(camelContext, java.lang.String.class, value)); return true;
        case "applicationName": ((GoogleCalendarStreamEndpoint) target).getConfiguration().setApplicationName(property(camelContext, java.lang.String.class, value)); return true;
        case "bridgeErrorHandler": ((GoogleCalendarStreamEndpoint) target).setBridgeErrorHandler(property(camelContext, boolean.class, value)); return true;
        case "calendarId": ((GoogleCalendarStreamEndpoint) target).getConfiguration().setCalendarId(property(camelContext, java.lang.String.class, value)); return true;
        case "clientId": ((GoogleCalendarStreamEndpoint) target).getConfiguration().setClientId(property(camelContext, java.lang.String.class, value)); return true;
        case "clientSecret": ((GoogleCalendarStreamEndpoint) target).getConfiguration().setClientSecret(property(camelContext, java.lang.String.class, value)); return true;
        case "considerLastUpdate": ((GoogleCalendarStreamEndpoint) target).getConfiguration().setConsiderLastUpdate(property(camelContext, boolean.class, value)); return true;
        case "consumeFromNow": ((GoogleCalendarStreamEndpoint) target).getConfiguration().setConsumeFromNow(property(camelContext, boolean.class, value)); return true;
        case "maxResults": ((GoogleCalendarStreamEndpoint) target).getConfiguration().setMaxResults(property(camelContext, int.class, value)); return true;
        case "query": ((GoogleCalendarStreamEndpoint) target).getConfiguration().setQuery(property(camelContext, java.lang.String.class, value)); return true;
        case "refreshToken": ((GoogleCalendarStreamEndpoint) target).getConfiguration().setRefreshToken(property(camelContext, java.lang.String.class, value)); return true;
        case "scopes": ((GoogleCalendarStreamEndpoint) target).getConfiguration().setScopes(property(camelContext, java.util.List.class, value)); return true;
        case "sendEmptyMessageWhenIdle": ((GoogleCalendarStreamEndpoint) target).setSendEmptyMessageWhenIdle(property(camelContext, boolean.class, value)); return true;
        case "exceptionHandler": ((GoogleCalendarStreamEndpoint) target).setExceptionHandler(property(camelContext, org.apache.camel.spi.ExceptionHandler.class, value)); return true;
        case "exchangePattern": ((GoogleCalendarStreamEndpoint) target).setExchangePattern(property(camelContext, org.apache.camel.ExchangePattern.class, value)); return true;
        case "pollStrategy": ((GoogleCalendarStreamEndpoint) target).setPollStrategy(property(camelContext, org.apache.camel.spi.PollingConsumerPollStrategy.class, value)); return true;
        case "basicPropertyBinding": ((GoogleCalendarStreamEndpoint) target).setBasicPropertyBinding(property(camelContext, boolean.class, value)); return true;
        case "synchronous": ((GoogleCalendarStreamEndpoint) target).setSynchronous(property(camelContext, boolean.class, value)); return true;
        case "backoffErrorThreshold": ((GoogleCalendarStreamEndpoint) target).setBackoffErrorThreshold(property(camelContext, int.class, value)); return true;
        case "backoffIdleThreshold": ((GoogleCalendarStreamEndpoint) target).setBackoffIdleThreshold(property(camelContext, int.class, value)); return true;
        case "backoffMultiplier": ((GoogleCalendarStreamEndpoint) target).setBackoffMultiplier(property(camelContext, int.class, value)); return true;
        case "delay": ((GoogleCalendarStreamEndpoint) target).setDelay(property(camelContext, long.class, value)); return true;
        case "greedy": ((GoogleCalendarStreamEndpoint) target).setGreedy(property(camelContext, boolean.class, value)); return true;
        case "initialDelay": ((GoogleCalendarStreamEndpoint) target).setInitialDelay(property(camelContext, long.class, value)); return true;
        case "repeatCount": ((GoogleCalendarStreamEndpoint) target).setRepeatCount(property(camelContext, long.class, value)); return true;
        case "runLoggingLevel": ((GoogleCalendarStreamEndpoint) target).setRunLoggingLevel(property(camelContext, org.apache.camel.LoggingLevel.class, value)); return true;
        case "scheduledExecutorService": ((GoogleCalendarStreamEndpoint) target).setScheduledExecutorService(property(camelContext, java.util.concurrent.ScheduledExecutorService.class, value)); return true;
        case "scheduler": ((GoogleCalendarStreamEndpoint) target).setScheduler(property(camelContext, java.lang.String.class, value)); return true;
        case "schedulerProperties": ((GoogleCalendarStreamEndpoint) target).setSchedulerProperties(property(camelContext, java.util.Map.class, value)); return true;
        case "startScheduler": ((GoogleCalendarStreamEndpoint) target).setStartScheduler(property(camelContext, boolean.class, value)); return true;
        case "timeUnit": ((GoogleCalendarStreamEndpoint) target).setTimeUnit(property(camelContext, java.util.concurrent.TimeUnit.class, value)); return true;
        case "useFixedDelay": ((GoogleCalendarStreamEndpoint) target).setUseFixedDelay(property(camelContext, boolean.class, value)); return true;
            default: return false;
        }
    }

    private static boolean doConfigureIgnoreCase(CamelContext camelContext, Object target, String name, Object value) {
        switch (name.toLowerCase()) {
        case "accesstoken": ((GoogleCalendarStreamEndpoint) target).getConfiguration().setAccessToken(property(camelContext, java.lang.String.class, value)); return true;
        case "applicationname": ((GoogleCalendarStreamEndpoint) target).getConfiguration().setApplicationName(property(camelContext, java.lang.String.class, value)); return true;
        case "bridgeerrorhandler": ((GoogleCalendarStreamEndpoint) target).setBridgeErrorHandler(property(camelContext, boolean.class, value)); return true;
        case "calendarid": ((GoogleCalendarStreamEndpoint) target).getConfiguration().setCalendarId(property(camelContext, java.lang.String.class, value)); return true;
        case "clientid": ((GoogleCalendarStreamEndpoint) target).getConfiguration().setClientId(property(camelContext, java.lang.String.class, value)); return true;
        case "clientsecret": ((GoogleCalendarStreamEndpoint) target).getConfiguration().setClientSecret(property(camelContext, java.lang.String.class, value)); return true;
        case "considerlastupdate": ((GoogleCalendarStreamEndpoint) target).getConfiguration().setConsiderLastUpdate(property(camelContext, boolean.class, value)); return true;
        case "consumefromnow": ((GoogleCalendarStreamEndpoint) target).getConfiguration().setConsumeFromNow(property(camelContext, boolean.class, value)); return true;
        case "maxresults": ((GoogleCalendarStreamEndpoint) target).getConfiguration().setMaxResults(property(camelContext, int.class, value)); return true;
        case "query": ((GoogleCalendarStreamEndpoint) target).getConfiguration().setQuery(property(camelContext, java.lang.String.class, value)); return true;
        case "refreshtoken": ((GoogleCalendarStreamEndpoint) target).getConfiguration().setRefreshToken(property(camelContext, java.lang.String.class, value)); return true;
        case "scopes": ((GoogleCalendarStreamEndpoint) target).getConfiguration().setScopes(property(camelContext, java.util.List.class, value)); return true;
        case "sendemptymessagewhenidle": ((GoogleCalendarStreamEndpoint) target).setSendEmptyMessageWhenIdle(property(camelContext, boolean.class, value)); return true;
        case "exceptionhandler": ((GoogleCalendarStreamEndpoint) target).setExceptionHandler(property(camelContext, org.apache.camel.spi.ExceptionHandler.class, value)); return true;
        case "exchangepattern": ((GoogleCalendarStreamEndpoint) target).setExchangePattern(property(camelContext, org.apache.camel.ExchangePattern.class, value)); return true;
        case "pollstrategy": ((GoogleCalendarStreamEndpoint) target).setPollStrategy(property(camelContext, org.apache.camel.spi.PollingConsumerPollStrategy.class, value)); return true;
        case "basicpropertybinding": ((GoogleCalendarStreamEndpoint) target).setBasicPropertyBinding(property(camelContext, boolean.class, value)); return true;
        case "synchronous": ((GoogleCalendarStreamEndpoint) target).setSynchronous(property(camelContext, boolean.class, value)); return true;
        case "backofferrorthreshold": ((GoogleCalendarStreamEndpoint) target).setBackoffErrorThreshold(property(camelContext, int.class, value)); return true;
        case "backoffidlethreshold": ((GoogleCalendarStreamEndpoint) target).setBackoffIdleThreshold(property(camelContext, int.class, value)); return true;
        case "backoffmultiplier": ((GoogleCalendarStreamEndpoint) target).setBackoffMultiplier(property(camelContext, int.class, value)); return true;
        case "delay": ((GoogleCalendarStreamEndpoint) target).setDelay(property(camelContext, long.class, value)); return true;
        case "greedy": ((GoogleCalendarStreamEndpoint) target).setGreedy(property(camelContext, boolean.class, value)); return true;
        case "initialdelay": ((GoogleCalendarStreamEndpoint) target).setInitialDelay(property(camelContext, long.class, value)); return true;
        case "repeatcount": ((GoogleCalendarStreamEndpoint) target).setRepeatCount(property(camelContext, long.class, value)); return true;
        case "runlogginglevel": ((GoogleCalendarStreamEndpoint) target).setRunLoggingLevel(property(camelContext, org.apache.camel.LoggingLevel.class, value)); return true;
        case "scheduledexecutorservice": ((GoogleCalendarStreamEndpoint) target).setScheduledExecutorService(property(camelContext, java.util.concurrent.ScheduledExecutorService.class, value)); return true;
        case "scheduler": ((GoogleCalendarStreamEndpoint) target).setScheduler(property(camelContext, java.lang.String.class, value)); return true;
        case "schedulerproperties": ((GoogleCalendarStreamEndpoint) target).setSchedulerProperties(property(camelContext, java.util.Map.class, value)); return true;
        case "startscheduler": ((GoogleCalendarStreamEndpoint) target).setStartScheduler(property(camelContext, boolean.class, value)); return true;
        case "timeunit": ((GoogleCalendarStreamEndpoint) target).setTimeUnit(property(camelContext, java.util.concurrent.TimeUnit.class, value)); return true;
        case "usefixeddelay": ((GoogleCalendarStreamEndpoint) target).setUseFixedDelay(property(camelContext, boolean.class, value)); return true;
            default: return false;
        }
    }

}
