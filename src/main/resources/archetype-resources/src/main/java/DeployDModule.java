package ${package};

import org.devocative.demeter.imodule.DModule;
import org.devocative.demeter.iservice.ApplicationLifecyclePriority;

public class DeployDModule implements DModule {
	@Override
	public void init() {
	}

	@Override
	public void shutdown() {
	}

	@Override
	public ApplicationLifecyclePriority getLifecyclePriority() {
		return ApplicationLifecyclePriority.Third;
	}
}
