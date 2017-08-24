package ${package};

import org.devocative.demeter.imodule.DErrorCode;

public enum DeployErrorCode implements DErrorCode {
	;

	private String defaultDescription;

	DeployErrorCode(String defaultDescription) {
		this.defaultDescription = defaultDescription;
	}

	@Override
	public String getCode() {
		return name();
	}

	@Override
	public String getDefaultDescription() {
		return defaultDescription;
	}
}