package org.robobees.recyclerush;

import org.frc836.database.DB;
import org.frc836.database.PitStats;
import org.frc836.database.FRCScoutingContract.SCOUT_PIT_DATA_2015_Entry;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;

public class PitStatsRR extends PitStats {
	public boolean push_tote;
	public boolean push_bin;
	public boolean lift_tote;
	public boolean lift_bin;
	public boolean push_litter;
	public boolean load_litter;
	public short stack_tote_height;
	public short stack_bin_height;
	public short coop_totes;
	public short coop_stack_height;
	public boolean move_auto;
	public short auto_bin_score;
	public short auto_tote_score;
	public short auto_tote_stack_height;
	public short auto_step_bins;
	public String manipulation_description;
	public boolean need_upright_tote;
	public boolean need_upright_bin;
	public boolean can_upright_tote;
	public boolean can_upright_bin;

	public PitStatsRR() {
		init();
	}

	@Override
	public void init() {
		super.init();
		push_tote = false;
		push_bin = false;
		lift_tote = false;
		lift_bin = false;
		push_litter = false;
		load_litter = false;
		stack_tote_height = 0;
		stack_bin_height = 0;
		coop_totes = 0;
		coop_stack_height = 0;
		move_auto = false;
		auto_bin_score = 0;
		auto_tote_score = 0;
		auto_tote_stack_height = 0;
		auto_step_bins = 0;
		manipulation_description = "";
		need_upright_tote = false;
		need_upright_bin = false;
		can_upright_tote = false;
		can_upright_bin = false;
	}

	@Override
	public ContentValues getValues(DB db, SQLiteDatabase database) {
		ContentValues vals = super.getValues(db, database);

		vals.put(SCOUT_PIT_DATA_2015_Entry.COLUMN_NAME_PUSH_TOTE, push_tote ? 1
				: 0);
		vals.put(SCOUT_PIT_DATA_2015_Entry.COLUMN_NAME_PUSH_BIN, push_bin ? 1
				: 0);
		vals.put(SCOUT_PIT_DATA_2015_Entry.COLUMN_NAME_LIFT_TOTE, lift_tote ? 1
				: 0);
		vals.put(SCOUT_PIT_DATA_2015_Entry.COLUMN_NAME_LIFT_BIN, lift_bin ? 1
				: 0);
		vals.put(SCOUT_PIT_DATA_2015_Entry.COLUMN_NAME_PUSH_LITTER,
				push_litter ? 1 : 0);
		vals.put(SCOUT_PIT_DATA_2015_Entry.COLUMN_NAME_LOAD_LITTER,
				load_litter ? 1 : 0);
		vals.put(SCOUT_PIT_DATA_2015_Entry.COLUMN_NAME_STACK_TOTE_HEIGHT,
				stack_tote_height);
		vals.put(SCOUT_PIT_DATA_2015_Entry.COLUMN_NAME_STACK_BIN_HEIGHT,
				stack_bin_height);
		vals.put(SCOUT_PIT_DATA_2015_Entry.COLUMN_NAME_COOP_TOTES, coop_totes);
		vals.put(SCOUT_PIT_DATA_2015_Entry.COLUMN_NAME_COOP_STACK_HEIGHT,
				coop_stack_height);
		vals.put(SCOUT_PIT_DATA_2015_Entry.COLUMN_NAME_MOVE_AUTO, move_auto ? 1
				: 0);
		vals.put(SCOUT_PIT_DATA_2015_Entry.COLUMN_NAME_AUTO_BIN_SCORE,
				auto_bin_score);
		vals.put(SCOUT_PIT_DATA_2015_Entry.COLUMN_NAME_AUTO_TOTE_SCORE,
				auto_tote_score);
		vals.put(SCOUT_PIT_DATA_2015_Entry.COLUMN_NAME_AUTO_TOTE_STACK_HEIGHT,
				auto_tote_stack_height);
		vals.put(SCOUT_PIT_DATA_2015_Entry.COLUMN_NAME_AUTO_STEP_BINS,
				auto_step_bins);
		vals.put(SCOUT_PIT_DATA_2015_Entry.COLUMN_NAME_MANIP_STYLE,
				manipulation_description);
		vals.put(SCOUT_PIT_DATA_2015_Entry.COLUMN_NAME_NEED_UPRIGHT_TOTE,
				need_upright_tote ? 1 : 0);
		vals.put(SCOUT_PIT_DATA_2015_Entry.COLUMN_NAME_NEED_UPRIGHT_BIN,
				need_upright_bin ? 1 : 0);
		vals.put(SCOUT_PIT_DATA_2015_Entry.COLUMN_NAME_CAN_UPRIGHT_TOTE,
				can_upright_tote ? 1 : 0);
		vals.put(SCOUT_PIT_DATA_2015_Entry.COLUMN_NAME_CAN_UPRIGHT_BIN,
				can_upright_bin ? 1 : 0);

		return vals;
	}

	@Override
	public void fromCursor(Cursor c, DB db, SQLiteDatabase database) {
		super.fromCursor(c, db, database);

		push_tote = c
				.getInt(c
						.getColumnIndexOrThrow(SCOUT_PIT_DATA_2015_Entry.COLUMN_NAME_PUSH_TOTE)) != 0;
		push_bin = c
				.getInt(c
						.getColumnIndexOrThrow(SCOUT_PIT_DATA_2015_Entry.COLUMN_NAME_PUSH_BIN)) != 0;
		lift_tote = c
				.getInt(c
						.getColumnIndexOrThrow(SCOUT_PIT_DATA_2015_Entry.COLUMN_NAME_LIFT_TOTE)) != 0;
		lift_bin = c
				.getInt(c
						.getColumnIndexOrThrow(SCOUT_PIT_DATA_2015_Entry.COLUMN_NAME_LIFT_BIN)) != 0;
		push_litter = c
				.getInt(c
						.getColumnIndexOrThrow(SCOUT_PIT_DATA_2015_Entry.COLUMN_NAME_PUSH_LITTER)) != 0;
		load_litter = c
				.getInt(c
						.getColumnIndexOrThrow(SCOUT_PIT_DATA_2015_Entry.COLUMN_NAME_LOAD_LITTER)) != 0;
		stack_tote_height = c
				.getShort(c
						.getColumnIndexOrThrow(SCOUT_PIT_DATA_2015_Entry.COLUMN_NAME_STACK_TOTE_HEIGHT));
		stack_bin_height = c
				.getShort(c
						.getColumnIndexOrThrow(SCOUT_PIT_DATA_2015_Entry.COLUMN_NAME_STACK_BIN_HEIGHT));
		coop_totes = c
				.getShort(c
						.getColumnIndexOrThrow(SCOUT_PIT_DATA_2015_Entry.COLUMN_NAME_COOP_TOTES));
		coop_stack_height = c
				.getShort(c
						.getColumnIndexOrThrow(SCOUT_PIT_DATA_2015_Entry.COLUMN_NAME_COOP_STACK_HEIGHT));
		move_auto = c
				.getInt(c
						.getColumnIndexOrThrow(SCOUT_PIT_DATA_2015_Entry.COLUMN_NAME_MOVE_AUTO)) != 0;
		auto_bin_score = c
				.getShort(c
						.getColumnIndexOrThrow(SCOUT_PIT_DATA_2015_Entry.COLUMN_NAME_AUTO_BIN_SCORE));
		auto_tote_score = c
				.getShort(c
						.getColumnIndexOrThrow(SCOUT_PIT_DATA_2015_Entry.COLUMN_NAME_AUTO_TOTE_SCORE));
		auto_tote_stack_height = c
				.getShort(c
						.getColumnIndexOrThrow(SCOUT_PIT_DATA_2015_Entry.COLUMN_NAME_AUTO_TOTE_STACK_HEIGHT));
		auto_step_bins = c
				.getShort(c
						.getColumnIndexOrThrow(SCOUT_PIT_DATA_2015_Entry.COLUMN_NAME_AUTO_STEP_BINS));
		manipulation_description = c
				.getString(c
						.getColumnIndexOrThrow(SCOUT_PIT_DATA_2015_Entry.COLUMN_NAME_MANIP_STYLE));
		need_upright_tote = c
				.getInt(c
						.getColumnIndexOrThrow(SCOUT_PIT_DATA_2015_Entry.COLUMN_NAME_NEED_UPRIGHT_TOTE)) != 0;
		need_upright_bin = c
				.getInt(c
						.getColumnIndexOrThrow(SCOUT_PIT_DATA_2015_Entry.COLUMN_NAME_NEED_UPRIGHT_BIN)) != 0;
		can_upright_tote = c
				.getInt(c
						.getColumnIndexOrThrow(SCOUT_PIT_DATA_2015_Entry.COLUMN_NAME_CAN_UPRIGHT_TOTE)) != 0;
		can_upright_bin = c
				.getInt(c
						.getColumnIndexOrThrow(SCOUT_PIT_DATA_2015_Entry.COLUMN_NAME_CAN_UPRIGHT_BIN)) != 0;
	}
}
