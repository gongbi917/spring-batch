package org.springframework.batch.integration.launch;

import org.springframework.batch.core.JobParameters;
import org.springframework.integration.message.Message;


/**
 * 
 * @author Jonas Partner
 *
 */
public interface MessageToJobParametersStrategy {
	
	public JobParameters getJobParameters(Message<?> message);

}