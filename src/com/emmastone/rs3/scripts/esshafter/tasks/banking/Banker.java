package com.emmastone.rs3.scripts.esshafter.tasks.banking;

import org.powerbot.script.methods.MethodContext;

import com.emmastone.rs3.scripts.esshafter.data.Log;
import com.emmastone.rs3.scripts.esshafter.data.Shaft;
import com.emmastone.rs3.scripts.framework.Task;

public class Banker extends Task {

	public Banker(MethodContext ctx) {
		super(ctx);
	}

	@Override
	public boolean activate() {
		return ctx.backpack.select().id(Shaft.SHAFTS.getShaftId()).count() == 1 
				&& ctx.backpack.select().id(Log.LOGS.getLogId()).count() == 0;
	}

	@Override
	public void execute() {
		if (ctx.bank.isInViewport()) {
			if (ctx.bank.open()) {
				if (ctx.bank.depositInventory()) {
					if (ctx.bank.withdraw(1511, 28)) {
						ctx.bank.close();
					}
				}

			}

		}
	}
}
