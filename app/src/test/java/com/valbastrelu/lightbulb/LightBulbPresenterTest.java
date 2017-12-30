package com.valbastrelu.lightbulb;

import org.junit.Assert;
import org.junit.Test;

import java.util.Stack;

/**
 * Created by Crow on 9/12/2017.
 */
public class LightBulbPresenterTest {

    @Test
    public final void shouldPass(){
        Assert.assertEquals(2,2);
    }

    @Test
    public final void code(){
        //given
//        LightBulbViewI view = new MockView();
//        LightBulbPresenter presenter = new LightBulbPresenter(view);
//        Lvl1Model model = new MockModel(presenter);

        //when
//        presenter.updateCheckCode(0,1);

        //then
//        Assert.assertEquals(true, model.checkEquals());
    }

    private class MockView{

    }

    private class MockModel{
        Stack<Integer> cod = new Stack<>();
        Stack<Integer> cod1 = new Stack<>();

        MockModel() {
            cod.add(1);
        }
    }
}