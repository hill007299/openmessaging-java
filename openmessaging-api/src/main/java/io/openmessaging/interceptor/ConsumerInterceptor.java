package io.openmessaging.interceptor;

import io.openmessaging.KeyValue;
import io.openmessaging.Message;
import io.openmessaging.consumer.MessageListener;

/**
 * A {@code ConsumerInterceptor} is used to intercept consume operations of push consumer.
 *
 * @version OMS 1.0.0
 * @since OMS 1.0.0
 */
public interface ConsumerInterceptor {
    /**
     * Invoked before the invocation of {@link MessageListener#onReceived(Message, MessageListener.Context)}.
     *
     * @param message the message is actually received
     * @param attributes the extensible attributes delivered to the intercept thread
     */
    void preReceive(Message message, KeyValue attributes);

    /**
     * Called after a message is consumed.
     *
     * @param context the context delivered to the intercept thread
     */
    /**
     * Invoked after the invocation of {@link MessageListener#onReceived(Message, MessageListener.Context)}.
     *
     * @param message the message is actually received
     * @param attributes the extensible attributes delivered to the intercept thread
     */
    void postReceive(Message message, KeyValue attributes);
}
