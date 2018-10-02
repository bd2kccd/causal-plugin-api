package edu.pitt.dbmi.tetrad.plugin.api;

import org.pf4j.ExtensionPoint;

/**
 * Sep 20, 2018 5:06:57 PM
 *
 * @author Chirayu Kong Wongchokprasitti, PhD (chw20@pitt.edu)
 *
 */
public interface CausalPlugin extends ExtensionPoint {
	
	public String getAlgorithmDescriptions();
	
}
