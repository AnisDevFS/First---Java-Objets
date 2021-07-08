package com.lambdaAndCA.exercices;

import java.io.File;
import java.io.IOException;

@FunctionalInterface
public interface Fichier {

	void lire(File file, String[] tab)
			throws IOException;
}
