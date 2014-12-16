package com.agileengineers.lesson.tdd.supermarket.directory;

import com.agileengineers.lesson.tdd.supermarket.Barcode;

public class ArticleNotFoundException extends IllegalArgumentException {

	private static final long serialVersionUID = -5529114511858720184L;

	public ArticleNotFoundException(Barcode barcodeOfUnknownArticle) {
		super(String.format("Unable to find article with barcode '%d'",
			barcodeOfUnknownArticle.getDigits()));
	}

}