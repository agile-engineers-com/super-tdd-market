package com.agileengineers.lesson.tdd.supermarket.directory;

import com.agileengineers.lesson.tdd.supermarket.Barcode;

public interface Directory {

	Article
	getArticle(Barcode barcode) throws ArticleNotFoundException;

}
