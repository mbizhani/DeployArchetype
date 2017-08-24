package ${package};

import org.devocative.demeter.imodule.DModuleException;

public class DeployException extends DModuleException {
	public DeployException(DeployErrorCode errorCode) {
		this(errorCode, null, null);
	}

	public DeployException(DeployErrorCode errorCode, String errorParameter) {
		this(errorCode, errorParameter, null);
	}

	// Main Constructor
	public DeployException(DeployErrorCode errorCode, String errorParameter, Throwable cause) {
		super("dpl", errorCode, errorParameter, cause);
	}
}