package example.field.withimpl;

import java.util.List;

import javax.annotation.PostConstruct;

import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import example.DemoInterface;

@Component
public class InjectionPoint {

	@Autowired
	private List<DemoInterface> impl;

	@PostConstruct
	public void postConstruct() {
		LogFactory.getLog(getClass()).info(impl);
	}
}
