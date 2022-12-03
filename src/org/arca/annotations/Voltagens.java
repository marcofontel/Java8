package org.arca.annotations;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

public @Retention(RetentionPolicy.RUNTIME)
@interface Voltagens{
	Voltagem[] value();
	}

