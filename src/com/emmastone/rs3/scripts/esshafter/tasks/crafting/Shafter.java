package com.emmastone.rs3.scripts.esshafter.tasks.crafting;

import java.util.concurrent.Callable;

import org.powerbot.script.methods.MethodContext;
import org.powerbot.script.util.Condition;
import org.powerbot.script.wrappers.Item;

import com.emmastone.rs3.scripts.esshafter.data.Log;
import com.emmastone.rs3.scripts.framework.Task;

public class Shafter extends Task {

	public Shafter(MethodContext ctx) {
		super(ctx);

	}

	@Override
	public boolean activate() {
		return ctx.players.local().isIdle()
				&& ctx.backpack.select().count() >= 1;

	}

	@Override
	public void execute() {
		Item i = ctx.backpack.select().id(Log.LOGS.getLogId()).poll();
		if (i.interact("Craft")) {
			Condition.wait(new Callable<Boolean>() {

				@Override
				public Boolean call() throws Exception {
					return ctx.widgets.get(1179).isValid();

				}
			}, 200, 1);

			Condition.wait(new Callable<Boolean>() {

				@Override
				public Boolean call() throws Exception {
					return ctx.widgets.get(1370).isValid();

				}
			}, 200, 1);

			Condition.wait(new Callable<Boolean>() {

				@Override
				public Boolean call() throws Exception {
					return ctx.widgets.get(1401).isValid();

				}
			}, 200, 1);

			Condition.wait(new Callable<Boolean>() {

				@Override
				public Boolean call() throws Exception {
					return ctx.widgets.get(1251).isValid();

				}
			}, 200, 1);

		}
		if(ctx.widgets.get(1179, 2).click()){
			Condition.wait(new Callable<Boolean>() {

				@Override
				public Boolean call() throws Exception {
					return ctx.widgets.get(1179).isValid();

				}
			}, 200, 1);

			Condition.wait(new Callable<Boolean>() {

				@Override
				public Boolean call() throws Exception {
					return ctx.widgets.get(1370).isValid();

				}
			}, 200, 1);

			Condition.wait(new Callable<Boolean>() {

				@Override
				public Boolean call() throws Exception {
					return ctx.widgets.get(1401).isValid();

				}
			}, 200, 1);

			Condition.wait(new Callable<Boolean>() {

				@Override
				public Boolean call() throws Exception {
					return ctx.widgets.get(1251).isValid();

				}
			}, 200, 1);
		}
		if(ctx.widgets.get(1370, 20).click()){
			Condition.wait(new Callable<Boolean>() {

				@Override
				public Boolean call() throws Exception {
					return ctx.widgets.get(1179).isValid();

				}
			}, 200, 1);

			Condition.wait(new Callable<Boolean>() {

				@Override
				public Boolean call() throws Exception {
					return ctx.widgets.get(1370).isValid();

				}
			}, 200, 1);

			Condition.wait(new Callable<Boolean>() {

				@Override
				public Boolean call() throws Exception {
					return ctx.widgets.get(1401).isValid();

				}
			}, 200, 1);

			Condition.wait(new Callable<Boolean>() {

				@Override
				public Boolean call() throws Exception {
					return ctx.widgets.get(1251).isValid();

				}
			}, 200, 1);
		}
		if(ctx.widgets.get(1401, 31).click()){
			Condition.wait(new Callable<Boolean>() {

				@Override
				public Boolean call() throws Exception {
					return ctx.widgets.get(1179).isValid();

				}
			}, 200, 1);

			Condition.wait(new Callable<Boolean>() {

				@Override
				public Boolean call() throws Exception {
					return ctx.widgets.get(1370).isValid();

				}
			}, 200, 1);

			Condition.wait(new Callable<Boolean>() {

				@Override
				public Boolean call() throws Exception {
					return ctx.widgets.get(1401).isValid();

				}
			}, 200, 1);

			Condition.wait(new Callable<Boolean>() {

				@Override
				public Boolean call() throws Exception {
					return ctx.widgets.get(1251).isValid();

				}
			}, 200, 1);
		}
	}
}
