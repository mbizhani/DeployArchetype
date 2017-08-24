package ${package};

import org.devocative.adroit.IConfigKey;

import java.util.List;

public enum DeployConfigKey implements IConfigKey {
	;

	private String key;
	private boolean validate = false;
	private Object defaultValue;
	private List<?> possibilities;

	DeployConfigKey(String key) {
		this(false, key, null);
	}

	DeployConfigKey(String key, List<?> possibilities) {
		this(false, key, possibilities);
	}

	DeployConfigKey(boolean validate, String key) {
		this(validate, key, null);
	}

	// Main Constructor 1
	DeployConfigKey(boolean validate, String key, List<?> possibilities) {
		this.key = key;
		this.validate = validate;
		this.possibilities = possibilities;
	}

	DeployConfigKey(String key, Object defaultValue) {
		this(key, defaultValue, null);
	}

	// Main Constructor 2
	DeployConfigKey(String key, Object defaultValue, List<?> possibilities) {
		this.key = key;
		this.defaultValue = defaultValue;
		this.possibilities = possibilities;
	}

	@Override
	public String getKey() {
		return key;
	}

	@Override
	public boolean getValidate() {
		return validate;
	}

	@Override
	public Object getDefaultValue() {
		return defaultValue;
	}

	@Override
	public List<?> getPossibleValues() {
		return possibilities;
	}
}
