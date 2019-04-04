package example.constructor.withoutimpl;

import java.util.List;

import javax.annotation.PostConstruct;

import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import example.DemoInterface;

@Component
public class InjectionPoint {

	private List<DemoInterface> impl;

	@Autowired
	public InjectionPoint(final List<DemoInterface> impl) {
		this.impl = impl;
	}

	@PostConstruct
	public void postConstruct() {
		LogFactory.getLog(getClass()).info(impl);
	}
}
