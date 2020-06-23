package com.test.javaproject;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class JavaTest {

	    String name; int count;
	    JavaTest(String name, int count){
	        this.name = name; this.count = count;
	    }
	    
	 
	    public List<String> getTopNCompetitors(int numCompetitors, int topNCompetitors, String[] competitors,  int numReviews, String[] reviews){
	        List<String> result = new ArrayList<>();
	        List<JavaTest> compsWithReviews = new ArrayList<>(numCompetitors);
	        for (String comp : competitors) compsWithReviews.add(new JavaTest(comp, 0));
	        compsWithReviews.stream().forEach(comp -> countReviewsForEveryCompetitor(reviews, comp));
	        Collections.sort(compsWithReviews, (c1, c2) -> c1.count != c2.count ? c2.count - c1.count : c1.name.compareTo(c2.name));
	        for (int i = 0; i < topNCompetitors; i++) result.add(compsWithReviews.get(i).name);
	        return result;
	    }
	 
	    private void countReviewsForEveryCompetitor(String[] reviews, JavaTest comp) {
	        for (String review : reviews)
	            if (review.toLowerCase().contains(comp.name.toLowerCase()))
	                comp.count++;
	    }
}
