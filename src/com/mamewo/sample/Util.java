package com.mamewo.sample;

import java.util.List;

public class Util {
	static
	public void insertItem(List<Comparable> lst, Comparable item, int from, int to) {
		if(lst.size() == 0){
			lst.add(item);
		}
		else {
			int med = (from+to)/2;
			int diff = item.compareTo(lst.get(med));
			if(from == to){
				if(diff <= 0){
					lst.add(from, item);
				}
				else {
					lst.add(from+1, item);
				}
			}
			else {
				if(diff < 0){
					insertItem(lst, item, from, Math.max(from, med-1));
				}
				//TODO: insert to head of run
				else if (diff == 0){
					lst.add(med, item);
				}
				else {
					insertItem(lst, item, Math.min(med+1,to), to);
				}
			}
		}
	}
}
