package com.sisphus.springframeworktutorials.basic;

import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
import org.springframework.beans.factory.config.*;

@Component
@Primary
@Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
class BubbleSortAlgorithm implements SortAlgorithm {

    @Override
    public int[] sort(int[] data) {
        // logic for bubblesort
        return data;
    }

}