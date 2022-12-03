package org.arca.annotations;

import java.lang.annotation.Repeatable;

public @Repeatable(Voltagens.class)
@interface Voltagem{
	String tensao();
}

