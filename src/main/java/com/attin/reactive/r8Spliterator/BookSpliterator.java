package com.attin.reactive.r8Spliterator;

import java.util.Spliterator;
import java.util.function.Consumer;

public class BookSpliterator implements Spliterator<Book> {

    private String name;
    private String author;
    private String genre;
    private double rating;
    private Spliterator<String> baseSpliterator;

    public BookSpliterator(Spliterator<String> baseSpliterator) {
        this.baseSpliterator = baseSpliterator;
    }

    @Override
    public boolean tryAdvance(Consumer<? super Book> action) {

        if (baseSpliterator.tryAdvance(name -> this.name = name) && baseSpliterator.tryAdvance(author -> this.author = name) &&
                baseSpliterator.tryAdvance(genre -> this.genre = genre) && baseSpliterator.tryAdvance(rating -> this.rating = Double.valueOf(rating))
        ) {
            action.accept(new Book(this.name, this.author, this.genre, this.rating));
            return true;
        }

        return false;
    }


    @Override
    public Spliterator<Book> trySplit() {
        return null;
    }

    @Override
    public long estimateSize() {
        return baseSpliterator.estimateSize() / 4;
    }

    @Override
    public int characteristics() {
        return baseSpliterator.characteristics();
    }
}
