package org.javaturk.dp.ch04.singleton.postCode;

import java.util.List;

public enum PostCodeServiceEnum implements PostCodeService{
	INSTANCE;

	@Override
	public PostCode getPostCode(City city, Neighborhood neighborhood) {
		return null;
	}

	@Override
	public PostCode getPostCode(City city, Street street) {
		return null;
	}

	@Override
	public List<PostCode> getPostCodes(City city) {
		return null;
	}

	@Override
	public List<PostCode> getPostCodesAround(PostCode postCode) {
		return null;
	}

	@Override
	public void refresh() {
		
	}
}
