package org.javaturk.dp.ch04.singleton.postCode;

import java.util.List;

public interface PostCodeService {
	
	public PostCode getPostCode(City city, Neighborhood neighborhood);

	public PostCode getPostCode(City city, Street street);
	
	public List<PostCode> getPostCodes(City city);
	
	public List<PostCode> getPostCodesAround(PostCode postCode);
	
	public void refresh();
}
