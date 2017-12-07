package script;

import java.awt.Image;
import java.util.ArrayList;
import java.util.HashMap;

/**
 * This class represents a script, a script has content and charaters
 * 
 * @author yueyin
 *
 */
public class Script {

	private String name;
	private String content;
	private Relationships relationgraph;
	private Image poster;

	private ArrayList<Persona> mainCharacters;
	private HashMap<String, HashMap<String, Double>> naturalLangUnderstanding;
	// HashMap<String, Integer> mainCharacters, or TreeMap
	// Key: name. Value: occurrences.
	// HashMap<String, HashMap<String, Double>> naturalLangUnderstanding
	// emotionToneTimeline
	// HashMap<String, HashMap<String, Double>> lineEmotionTone
	// langToneTimeline
	// HashMap<String, HashMap<String, Double>> lineLangTone
	// Personality of individual characters, type to be determined

	public Script() {

	}

	public Script(String name, String content, Relationships relationgraph, Image post,
			ArrayList<Persona> mainCharacters, HashMap<String, HashMap<String, Double>> naturalLangUnderstanding) {
		super();
		this.name = name;
		this.content = content;
		this.relationgraph = relationgraph;
		this.poster = post;

		this.mainCharacters = mainCharacters;
		this.naturalLangUnderstanding = naturalLangUnderstanding;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @return the content
	 */
	public String getContent() {
		return content;
	}

	/**
	 * @param content
	 *            the content to set
	 */
	public void setContent(String content) {
		this.content = content;
	}

	/**
	 * @return the relationgraph
	 */
	public Relationships getRelationgraph() {
		return relationgraph;
	}

	/**
	 * @param relationgraph
	 *            the relationgraph to set
	 */
	public void setRelationgraph(Relationships relationgraph) {
		this.relationgraph = relationgraph;
	}

	/**
	 * @return the post
	 */
	public Image getPost() {
		return poster;
	}

	/**
	 * @param post
	 *            the post to set
	 */
	public void setPost(Image post) {
		this.poster = post;
	}

	public ArrayList<Persona> getMainCharacters() {
		return mainCharacters;
	}

	public void setMainCharacters(ArrayList<Persona> mainCharacters) {
		this.mainCharacters = mainCharacters;
	}

	public HashMap<String, HashMap<String, Double>> getNaturalLangUnderstanding() {
		return naturalLangUnderstanding;
	}

	public void setNaturalLangUnderstanding(HashMap<String, HashMap<String, Double>> naturalLangUnderstanding) {
		this.naturalLangUnderstanding = naturalLangUnderstanding;
	}

}
