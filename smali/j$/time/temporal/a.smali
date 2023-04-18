.class public final enum Lj$/time/temporal/a;
.super Ljava/lang/Enum;
.source "SourceFile"

# interfaces
.implements Lj$/time/temporal/l;


# static fields
.field public static final enum ALIGNED_DAY_OF_WEEK_IN_MONTH:Lj$/time/temporal/a;

.field public static final enum ALIGNED_DAY_OF_WEEK_IN_YEAR:Lj$/time/temporal/a;

.field public static final enum ALIGNED_WEEK_OF_MONTH:Lj$/time/temporal/a;

.field public static final enum ALIGNED_WEEK_OF_YEAR:Lj$/time/temporal/a;

.field public static final enum AMPM_OF_DAY:Lj$/time/temporal/a;

.field public static final enum CLOCK_HOUR_OF_AMPM:Lj$/time/temporal/a;

.field public static final enum CLOCK_HOUR_OF_DAY:Lj$/time/temporal/a;

.field public static final enum DAY_OF_MONTH:Lj$/time/temporal/a;

.field public static final enum DAY_OF_WEEK:Lj$/time/temporal/a;

.field public static final enum DAY_OF_YEAR:Lj$/time/temporal/a;

.field public static final enum EPOCH_DAY:Lj$/time/temporal/a;

.field public static final enum ERA:Lj$/time/temporal/a;

.field public static final enum HOUR_OF_AMPM:Lj$/time/temporal/a;

.field public static final enum HOUR_OF_DAY:Lj$/time/temporal/a;

.field public static final enum INSTANT_SECONDS:Lj$/time/temporal/a;

.field public static final enum MICRO_OF_DAY:Lj$/time/temporal/a;

.field public static final enum MICRO_OF_SECOND:Lj$/time/temporal/a;

.field public static final enum MILLI_OF_DAY:Lj$/time/temporal/a;

.field public static final enum MILLI_OF_SECOND:Lj$/time/temporal/a;

.field public static final enum MINUTE_OF_DAY:Lj$/time/temporal/a;

.field public static final enum MINUTE_OF_HOUR:Lj$/time/temporal/a;

.field public static final enum MONTH_OF_YEAR:Lj$/time/temporal/a;

.field public static final enum NANO_OF_DAY:Lj$/time/temporal/a;

.field public static final enum NANO_OF_SECOND:Lj$/time/temporal/a;

.field public static final enum OFFSET_SECONDS:Lj$/time/temporal/a;

.field public static final enum PROLEPTIC_MONTH:Lj$/time/temporal/a;

.field public static final enum SECOND_OF_DAY:Lj$/time/temporal/a;

.field public static final enum SECOND_OF_MINUTE:Lj$/time/temporal/a;

.field public static final enum YEAR:Lj$/time/temporal/a;

.field public static final enum YEAR_OF_ERA:Lj$/time/temporal/a;

.field private static final synthetic c:[Lj$/time/temporal/a;


# instance fields
.field private final a:Ljava/lang/String;

.field private final b:Lj$/time/temporal/q;


# direct methods
.method static constructor <clinit>()V
    .locals 61

    new-instance v0, Lj$/time/temporal/a;

    sget-object v1, Lj$/time/temporal/b;->NANOS:Lj$/time/temporal/b;

    const-wide/16 v1, 0x0

    const-wide/32 v3, 0x3b9ac9ff

    invoke-static {v1, v2, v3, v4}, Lj$/time/temporal/q;->i(JJ)Lj$/time/temporal/q;

    move-result-object v5

    const-string v6, "NANO_OF_SECOND"

    const/4 v7, 0x0

    const-string v8, "NanoOfSecond"

    invoke-direct {v0, v6, v7, v8, v5}, Lj$/time/temporal/a;-><init>(Ljava/lang/String;ILjava/lang/String;Lj$/time/temporal/q;)V

    sput-object v0, Lj$/time/temporal/a;->NANO_OF_SECOND:Lj$/time/temporal/a;

    new-instance v5, Lj$/time/temporal/a;

    const-wide v8, 0x4e94914effffL

    invoke-static {v1, v2, v8, v9}, Lj$/time/temporal/q;->i(JJ)Lj$/time/temporal/q;

    move-result-object v6

    const-string v8, "NANO_OF_DAY"

    const/4 v9, 0x1

    const-string v10, "NanoOfDay"

    invoke-direct {v5, v8, v9, v10, v6}, Lj$/time/temporal/a;-><init>(Ljava/lang/String;ILjava/lang/String;Lj$/time/temporal/q;)V

    sput-object v5, Lj$/time/temporal/a;->NANO_OF_DAY:Lj$/time/temporal/a;

    new-instance v6, Lj$/time/temporal/a;

    const-wide/32 v10, 0xf423f

    invoke-static {v1, v2, v10, v11}, Lj$/time/temporal/q;->i(JJ)Lj$/time/temporal/q;

    move-result-object v8

    const-string v10, "MICRO_OF_SECOND"

    const/4 v11, 0x2

    const-string v12, "MicroOfSecond"

    invoke-direct {v6, v10, v11, v12, v8}, Lj$/time/temporal/a;-><init>(Ljava/lang/String;ILjava/lang/String;Lj$/time/temporal/q;)V

    sput-object v6, Lj$/time/temporal/a;->MICRO_OF_SECOND:Lj$/time/temporal/a;

    new-instance v8, Lj$/time/temporal/a;

    const-wide v12, 0x141dd75fffL

    invoke-static {v1, v2, v12, v13}, Lj$/time/temporal/q;->i(JJ)Lj$/time/temporal/q;

    move-result-object v10

    const-string v12, "MICRO_OF_DAY"

    const/4 v13, 0x3

    const-string v14, "MicroOfDay"

    invoke-direct {v8, v12, v13, v14, v10}, Lj$/time/temporal/a;-><init>(Ljava/lang/String;ILjava/lang/String;Lj$/time/temporal/q;)V

    sput-object v8, Lj$/time/temporal/a;->MICRO_OF_DAY:Lj$/time/temporal/a;

    new-instance v10, Lj$/time/temporal/a;

    const-wide/16 v14, 0x3e7

    invoke-static {v1, v2, v14, v15}, Lj$/time/temporal/q;->i(JJ)Lj$/time/temporal/q;

    move-result-object v12

    const-string v14, "MILLI_OF_SECOND"

    const/4 v15, 0x4

    const-string v13, "MilliOfSecond"

    invoke-direct {v10, v14, v15, v13, v12}, Lj$/time/temporal/a;-><init>(Ljava/lang/String;ILjava/lang/String;Lj$/time/temporal/q;)V

    sput-object v10, Lj$/time/temporal/a;->MILLI_OF_SECOND:Lj$/time/temporal/a;

    new-instance v12, Lj$/time/temporal/a;

    const-wide/32 v13, 0x5265bff

    invoke-static {v1, v2, v13, v14}, Lj$/time/temporal/q;->i(JJ)Lj$/time/temporal/q;

    move-result-object v13

    const-string v14, "MILLI_OF_DAY"

    const/4 v15, 0x5

    const-string v11, "MilliOfDay"

    invoke-direct {v12, v14, v15, v11, v13}, Lj$/time/temporal/a;-><init>(Ljava/lang/String;ILjava/lang/String;Lj$/time/temporal/q;)V

    sput-object v12, Lj$/time/temporal/a;->MILLI_OF_DAY:Lj$/time/temporal/a;

    new-instance v11, Lj$/time/temporal/a;

    const-string v17, "SECOND_OF_MINUTE"

    const/16 v18, 0x6

    const-string v19, "SecondOfMinute"

    const-wide/16 v13, 0x3b

    invoke-static {v1, v2, v13, v14}, Lj$/time/temporal/q;->i(JJ)Lj$/time/temporal/q;

    move-result-object v20

    const/16 v21, 0x0

    move-object/from16 v16, v11

    invoke-direct/range {v16 .. v21}, Lj$/time/temporal/a;-><init>(Ljava/lang/String;ILjava/lang/String;Lj$/time/temporal/q;I)V

    sput-object v11, Lj$/time/temporal/a;->SECOND_OF_MINUTE:Lj$/time/temporal/a;

    new-instance v15, Lj$/time/temporal/a;

    move-object/from16 v18, v10

    const-wide/32 v9, 0x1517f

    invoke-static {v1, v2, v9, v10}, Lj$/time/temporal/q;->i(JJ)Lj$/time/temporal/q;

    move-result-object v9

    const-string v10, "SECOND_OF_DAY"

    const/4 v7, 0x7

    const-string v3, "SecondOfDay"

    invoke-direct {v15, v10, v7, v3, v9}, Lj$/time/temporal/a;-><init>(Ljava/lang/String;ILjava/lang/String;Lj$/time/temporal/q;)V

    sput-object v15, Lj$/time/temporal/a;->SECOND_OF_DAY:Lj$/time/temporal/a;

    new-instance v3, Lj$/time/temporal/a;

    const-string v23, "MINUTE_OF_HOUR"

    const/16 v24, 0x8

    const-string v25, "MinuteOfHour"

    invoke-static {v1, v2, v13, v14}, Lj$/time/temporal/q;->i(JJ)Lj$/time/temporal/q;

    move-result-object v26

    const/16 v27, 0x0

    move-object/from16 v22, v3

    invoke-direct/range {v22 .. v27}, Lj$/time/temporal/a;-><init>(Ljava/lang/String;ILjava/lang/String;Lj$/time/temporal/q;I)V

    sput-object v3, Lj$/time/temporal/a;->MINUTE_OF_HOUR:Lj$/time/temporal/a;

    new-instance v4, Lj$/time/temporal/a;

    const-wide/16 v9, 0x59f

    invoke-static {v1, v2, v9, v10}, Lj$/time/temporal/q;->i(JJ)Lj$/time/temporal/q;

    move-result-object v9

    const-string v10, "MINUTE_OF_DAY"

    const/16 v13, 0x9

    const-string v14, "MinuteOfDay"

    invoke-direct {v4, v10, v13, v14, v9}, Lj$/time/temporal/a;-><init>(Ljava/lang/String;ILjava/lang/String;Lj$/time/temporal/q;)V

    sput-object v4, Lj$/time/temporal/a;->MINUTE_OF_DAY:Lj$/time/temporal/a;

    new-instance v9, Lj$/time/temporal/a;

    const-wide/16 v13, 0xb

    invoke-static {v1, v2, v13, v14}, Lj$/time/temporal/q;->i(JJ)Lj$/time/temporal/q;

    move-result-object v13

    const-string v14, "HOUR_OF_AMPM"

    const/16 v10, 0xa

    const-string v7, "HourOfAmPm"

    invoke-direct {v9, v14, v10, v7, v13}, Lj$/time/temporal/a;-><init>(Ljava/lang/String;ILjava/lang/String;Lj$/time/temporal/q;)V

    sput-object v9, Lj$/time/temporal/a;->HOUR_OF_AMPM:Lj$/time/temporal/a;

    new-instance v7, Lj$/time/temporal/a;

    const-wide/16 v13, 0x1

    move-object/from16 v24, v11

    const-wide/16 v10, 0xc

    invoke-static {v13, v14, v10, v11}, Lj$/time/temporal/q;->i(JJ)Lj$/time/temporal/q;

    move-result-object v1

    const-string v2, "CLOCK_HOUR_OF_AMPM"

    const/16 v10, 0xb

    const-string v11, "ClockHourOfAmPm"

    invoke-direct {v7, v2, v10, v11, v1}, Lj$/time/temporal/a;-><init>(Ljava/lang/String;ILjava/lang/String;Lj$/time/temporal/q;)V

    sput-object v7, Lj$/time/temporal/a;->CLOCK_HOUR_OF_AMPM:Lj$/time/temporal/a;

    new-instance v1, Lj$/time/temporal/a;

    const-string v30, "HOUR_OF_DAY"

    const/16 v31, 0xc

    const-string v32, "HourOfDay"

    const-wide/16 v10, 0x17

    move-object/from16 v35, v3

    const-wide/16 v2, 0x0

    invoke-static {v2, v3, v10, v11}, Lj$/time/temporal/q;->i(JJ)Lj$/time/temporal/q;

    move-result-object v33

    const/16 v34, 0x0

    move-object/from16 v29, v1

    invoke-direct/range {v29 .. v34}, Lj$/time/temporal/a;-><init>(Ljava/lang/String;ILjava/lang/String;Lj$/time/temporal/q;I)V

    sput-object v1, Lj$/time/temporal/a;->HOUR_OF_DAY:Lj$/time/temporal/a;

    new-instance v2, Lj$/time/temporal/a;

    const-wide/16 v10, 0x18

    invoke-static {v13, v14, v10, v11}, Lj$/time/temporal/q;->i(JJ)Lj$/time/temporal/q;

    move-result-object v3

    const-string v10, "CLOCK_HOUR_OF_DAY"

    const/16 v11, 0xd

    const-string v13, "ClockHourOfDay"

    invoke-direct {v2, v10, v11, v13, v3}, Lj$/time/temporal/a;-><init>(Ljava/lang/String;ILjava/lang/String;Lj$/time/temporal/q;)V

    sput-object v2, Lj$/time/temporal/a;->CLOCK_HOUR_OF_DAY:Lj$/time/temporal/a;

    new-instance v3, Lj$/time/temporal/a;

    const-string v37, "AMPM_OF_DAY"

    const/16 v38, 0xe

    const-string v39, "AmPmOfDay"

    move-object v10, v12

    const-wide/16 v11, 0x1

    const-wide/16 v13, 0x0

    invoke-static {v13, v14, v11, v12}, Lj$/time/temporal/q;->i(JJ)Lj$/time/temporal/q;

    move-result-object v40

    const/16 v41, 0x0

    move-object/from16 v36, v3

    invoke-direct/range {v36 .. v41}, Lj$/time/temporal/a;-><init>(Ljava/lang/String;ILjava/lang/String;Lj$/time/temporal/q;I)V

    sput-object v3, Lj$/time/temporal/a;->AMPM_OF_DAY:Lj$/time/temporal/a;

    new-instance v11, Lj$/time/temporal/a;

    const-string v43, "DAY_OF_WEEK"

    const/16 v44, 0xf

    const-string v45, "DayOfWeek"

    const-wide/16 v12, 0x7

    move-object v14, v2

    move-object/from16 v32, v3

    const-wide/16 v2, 0x1

    invoke-static {v2, v3, v12, v13}, Lj$/time/temporal/q;->i(JJ)Lj$/time/temporal/q;

    move-result-object v46

    const/16 v47, 0x0

    move-object/from16 v42, v11

    invoke-direct/range {v42 .. v47}, Lj$/time/temporal/a;-><init>(Ljava/lang/String;ILjava/lang/String;Lj$/time/temporal/q;I)V

    sput-object v11, Lj$/time/temporal/a;->DAY_OF_WEEK:Lj$/time/temporal/a;

    move-object/from16 v33, v11

    new-instance v11, Lj$/time/temporal/a;

    move-object/from16 v34, v14

    invoke-static {v2, v3, v12, v13}, Lj$/time/temporal/q;->i(JJ)Lj$/time/temporal/q;

    move-result-object v14

    const-string v2, "ALIGNED_DAY_OF_WEEK_IN_MONTH"

    const/16 v3, 0x10

    const-string v12, "AlignedDayOfWeekInMonth"

    invoke-direct {v11, v2, v3, v12, v14}, Lj$/time/temporal/a;-><init>(Ljava/lang/String;ILjava/lang/String;Lj$/time/temporal/q;)V

    sput-object v11, Lj$/time/temporal/a;->ALIGNED_DAY_OF_WEEK_IN_MONTH:Lj$/time/temporal/a;

    new-instance v2, Lj$/time/temporal/a;

    move-object v14, v4

    const-wide/16 v3, 0x7

    const-wide/16 v12, 0x1

    invoke-static {v12, v13, v3, v4}, Lj$/time/temporal/q;->i(JJ)Lj$/time/temporal/q;

    move-result-object v3

    const-string v4, "ALIGNED_DAY_OF_WEEK_IN_YEAR"

    const/16 v12, 0x11

    const-string v13, "AlignedDayOfWeekInYear"

    invoke-direct {v2, v4, v12, v13, v3}, Lj$/time/temporal/a;-><init>(Ljava/lang/String;ILjava/lang/String;Lj$/time/temporal/q;)V

    sput-object v2, Lj$/time/temporal/a;->ALIGNED_DAY_OF_WEEK_IN_YEAR:Lj$/time/temporal/a;

    new-instance v3, Lj$/time/temporal/a;

    const-string v38, "DAY_OF_MONTH"

    const/16 v39, 0x12

    const-string v40, "DayOfMonth"

    const-wide/16 v12, 0x1c

    move-object/from16 v43, v5

    const-wide/16 v4, 0x1f

    invoke-static {v12, v13, v4, v5}, Lj$/time/temporal/q;->j(JJ)Lj$/time/temporal/q;

    move-result-object v41

    const/16 v42, 0x0

    move-object/from16 v37, v3

    invoke-direct/range {v37 .. v42}, Lj$/time/temporal/a;-><init>(Ljava/lang/String;ILjava/lang/String;Lj$/time/temporal/q;I)V

    sput-object v3, Lj$/time/temporal/a;->DAY_OF_MONTH:Lj$/time/temporal/a;

    new-instance v4, Lj$/time/temporal/a;

    const-wide/16 v12, 0x16d

    move-object v5, v2

    const-wide/16 v2, 0x16e

    invoke-static {v12, v13, v2, v3}, Lj$/time/temporal/q;->j(JJ)Lj$/time/temporal/q;

    move-result-object v2

    const-string v3, "DAY_OF_YEAR"

    const/16 v12, 0x13

    const-string v13, "DayOfYear"

    invoke-direct {v4, v3, v12, v13, v2}, Lj$/time/temporal/a;-><init>(Ljava/lang/String;ILjava/lang/String;Lj$/time/temporal/q;)V

    sput-object v4, Lj$/time/temporal/a;->DAY_OF_YEAR:Lj$/time/temporal/a;

    new-instance v2, Lj$/time/temporal/a;

    const-wide v12, -0x550a98b312L

    move-object/from16 v38, v4

    const-wide v3, 0x550a98b312L

    invoke-static {v12, v13, v3, v4}, Lj$/time/temporal/q;->i(JJ)Lj$/time/temporal/q;

    move-result-object v3

    const-string v4, "EPOCH_DAY"

    const/16 v12, 0x14

    const-string v13, "EpochDay"

    invoke-direct {v2, v4, v12, v13, v3}, Lj$/time/temporal/a;-><init>(Ljava/lang/String;ILjava/lang/String;Lj$/time/temporal/q;)V

    sput-object v2, Lj$/time/temporal/a;->EPOCH_DAY:Lj$/time/temporal/a;

    new-instance v3, Lj$/time/temporal/a;

    const-wide/16 v12, 0x4

    move-object/from16 v40, v5

    const-wide/16 v4, 0x5

    invoke-static {v12, v13, v4, v5}, Lj$/time/temporal/q;->j(JJ)Lj$/time/temporal/q;

    move-result-object v4

    const-string v5, "ALIGNED_WEEK_OF_MONTH"

    const/16 v12, 0x15

    const-string v13, "AlignedWeekOfMonth"

    invoke-direct {v3, v5, v12, v13, v4}, Lj$/time/temporal/a;-><init>(Ljava/lang/String;ILjava/lang/String;Lj$/time/temporal/q;)V

    sput-object v3, Lj$/time/temporal/a;->ALIGNED_WEEK_OF_MONTH:Lj$/time/temporal/a;

    new-instance v4, Lj$/time/temporal/a;

    const-wide/16 v12, 0x35

    move-object/from16 v42, v6

    const-wide/16 v5, 0x1

    invoke-static {v5, v6, v12, v13}, Lj$/time/temporal/q;->i(JJ)Lj$/time/temporal/q;

    move-result-object v12

    const-string v13, "ALIGNED_WEEK_OF_YEAR"

    const/16 v5, 0x16

    const-string v6, "AlignedWeekOfYear"

    invoke-direct {v4, v13, v5, v6, v12}, Lj$/time/temporal/a;-><init>(Ljava/lang/String;ILjava/lang/String;Lj$/time/temporal/q;)V

    sput-object v4, Lj$/time/temporal/a;->ALIGNED_WEEK_OF_YEAR:Lj$/time/temporal/a;

    new-instance v6, Lj$/time/temporal/a;

    const-string v47, "MONTH_OF_YEAR"

    const/16 v48, 0x17

    const-string v49, "MonthOfYear"

    move-object/from16 v28, v6

    const-wide/16 v5, 0xc

    const-wide/16 v12, 0x1

    invoke-static {v12, v13, v5, v6}, Lj$/time/temporal/q;->i(JJ)Lj$/time/temporal/q;

    move-result-object v50

    const/16 v51, 0x0

    move-object/from16 v46, v28

    invoke-direct/range {v46 .. v51}, Lj$/time/temporal/a;-><init>(Ljava/lang/String;ILjava/lang/String;Lj$/time/temporal/q;I)V

    sput-object v28, Lj$/time/temporal/a;->MONTH_OF_YEAR:Lj$/time/temporal/a;

    new-instance v5, Lj$/time/temporal/a;

    const-wide v12, -0x2cb4177f4L

    move-object v6, v3

    move-object/from16 v46, v4

    const-wide v3, 0x2cb4177ffL

    invoke-static {v12, v13, v3, v4}, Lj$/time/temporal/q;->i(JJ)Lj$/time/temporal/q;

    move-result-object v3

    const-string v4, "PROLEPTIC_MONTH"

    const/16 v12, 0x18

    const-string v13, "ProlepticMonth"

    invoke-direct {v5, v4, v12, v13, v3}, Lj$/time/temporal/a;-><init>(Ljava/lang/String;ILjava/lang/String;Lj$/time/temporal/q;)V

    sput-object v5, Lj$/time/temporal/a;->PROLEPTIC_MONTH:Lj$/time/temporal/a;

    new-instance v3, Lj$/time/temporal/a;

    const-wide/32 v12, 0x3b9aca00

    move-object/from16 v47, v5

    const-wide/32 v4, 0x3b9ac9ff

    invoke-static {v4, v5, v12, v13}, Lj$/time/temporal/q;->j(JJ)Lj$/time/temporal/q;

    move-result-object v12

    const-string v13, "YEAR_OF_ERA"

    const/16 v4, 0x19

    const-string v5, "YearOfEra"

    invoke-direct {v3, v13, v4, v5, v12}, Lj$/time/temporal/a;-><init>(Ljava/lang/String;ILjava/lang/String;Lj$/time/temporal/q;)V

    sput-object v3, Lj$/time/temporal/a;->YEAR_OF_ERA:Lj$/time/temporal/a;

    new-instance v4, Lj$/time/temporal/a;

    const-string v49, "YEAR"

    const/16 v50, 0x1a

    const-string v51, "Year"

    const-wide/32 v12, -0x3b9ac9ff

    move-object/from16 v54, v6

    const-wide/32 v5, 0x3b9ac9ff

    invoke-static {v12, v13, v5, v6}, Lj$/time/temporal/q;->i(JJ)Lj$/time/temporal/q;

    move-result-object v52

    const/16 v53, 0x0

    move-object/from16 v48, v4

    invoke-direct/range {v48 .. v53}, Lj$/time/temporal/a;-><init>(Ljava/lang/String;ILjava/lang/String;Lj$/time/temporal/q;I)V

    sput-object v4, Lj$/time/temporal/a;->YEAR:Lj$/time/temporal/a;

    new-instance v5, Lj$/time/temporal/a;

    const-string v56, "ERA"

    const/16 v57, 0x1b

    const-string v58, "Era"

    move-object v6, v3

    move-object/from16 v20, v4

    const-wide/16 v3, 0x1

    const-wide/16 v12, 0x0

    invoke-static {v12, v13, v3, v4}, Lj$/time/temporal/q;->i(JJ)Lj$/time/temporal/q;

    move-result-object v59

    const/16 v60, 0x0

    move-object/from16 v55, v5

    invoke-direct/range {v55 .. v60}, Lj$/time/temporal/a;-><init>(Ljava/lang/String;ILjava/lang/String;Lj$/time/temporal/q;I)V

    sput-object v5, Lj$/time/temporal/a;->ERA:Lj$/time/temporal/a;

    new-instance v3, Lj$/time/temporal/a;

    const-wide/high16 v12, -0x8000000000000000L

    move-object/from16 v21, v5

    const-wide v4, 0x7fffffffffffffffL

    invoke-static {v12, v13, v4, v5}, Lj$/time/temporal/q;->i(JJ)Lj$/time/temporal/q;

    move-result-object v4

    const-string v5, "INSTANT_SECONDS"

    const/16 v12, 0x1c

    const-string v13, "InstantSeconds"

    invoke-direct {v3, v5, v12, v13, v4}, Lj$/time/temporal/a;-><init>(Ljava/lang/String;ILjava/lang/String;Lj$/time/temporal/q;)V

    sput-object v3, Lj$/time/temporal/a;->INSTANT_SECONDS:Lj$/time/temporal/a;

    new-instance v4, Lj$/time/temporal/a;

    const-wide/32 v12, -0xfd20

    move-object/from16 v26, v6

    const-wide/32 v5, 0xfd20

    invoke-static {v12, v13, v5, v6}, Lj$/time/temporal/q;->i(JJ)Lj$/time/temporal/q;

    move-result-object v5

    const-string v6, "OFFSET_SECONDS"

    const/16 v12, 0x1d

    const-string v13, "OffsetSeconds"

    invoke-direct {v4, v6, v12, v13, v5}, Lj$/time/temporal/a;-><init>(Ljava/lang/String;ILjava/lang/String;Lj$/time/temporal/q;)V

    sput-object v4, Lj$/time/temporal/a;->OFFSET_SECONDS:Lj$/time/temporal/a;

    const/16 v5, 0x1e

    new-array v5, v5, [Lj$/time/temporal/a;

    const/4 v6, 0x0

    aput-object v0, v5, v6

    const/4 v0, 0x1

    aput-object v43, v5, v0

    const/4 v0, 0x2

    aput-object v42, v5, v0

    const/4 v0, 0x3

    aput-object v8, v5, v0

    const/4 v0, 0x4

    aput-object v18, v5, v0

    const/4 v0, 0x5

    aput-object v10, v5, v0

    const/4 v0, 0x6

    aput-object v24, v5, v0

    const/4 v0, 0x7

    aput-object v15, v5, v0

    const/16 v0, 0x8

    aput-object v35, v5, v0

    const/16 v0, 0x9

    aput-object v14, v5, v0

    const/16 v0, 0xa

    aput-object v9, v5, v0

    const/16 v0, 0xb

    aput-object v7, v5, v0

    const/16 v0, 0xc

    aput-object v1, v5, v0

    const/16 v0, 0xd

    aput-object v34, v5, v0

    const/16 v0, 0xe

    aput-object v32, v5, v0

    const/16 v0, 0xf

    aput-object v33, v5, v0

    const/16 v0, 0x10

    aput-object v11, v5, v0

    const/16 v0, 0x11

    aput-object v40, v5, v0

    const/16 v0, 0x12

    aput-object v37, v5, v0

    const/16 v0, 0x13

    aput-object v38, v5, v0

    const/16 v0, 0x14

    aput-object v2, v5, v0

    const/16 v0, 0x15

    aput-object v54, v5, v0

    const/16 v0, 0x16

    aput-object v46, v5, v0

    const/16 v0, 0x17

    aput-object v28, v5, v0

    const/16 v0, 0x18

    aput-object v47, v5, v0

    const/16 v0, 0x19

    aput-object v26, v5, v0

    const/16 v0, 0x1a

    aput-object v20, v5, v0

    const/16 v0, 0x1b

    aput-object v21, v5, v0

    const/16 v0, 0x1c

    aput-object v3, v5, v0

    const/16 v0, 0x1d

    aput-object v4, v5, v0

    sput-object v5, Lj$/time/temporal/a;->c:[Lj$/time/temporal/a;

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;ILjava/lang/String;Lj$/time/temporal/q;)V
    .locals 0

    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    iput-object p3, p0, Lj$/time/temporal/a;->a:Ljava/lang/String;

    iput-object p4, p0, Lj$/time/temporal/a;->b:Lj$/time/temporal/q;

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;ILjava/lang/String;Lj$/time/temporal/q;I)V
    .locals 0

    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    iput-object p3, p0, Lj$/time/temporal/a;->a:Ljava/lang/String;

    iput-object p4, p0, Lj$/time/temporal/a;->b:Lj$/time/temporal/q;

    return-void
.end method

.method public static valueOf(Ljava/lang/String;)Lj$/time/temporal/a;
    .locals 1

    const-class v0, Lj$/time/temporal/a;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lj$/time/temporal/a;

    return-object p0
.end method

.method public static values()[Lj$/time/temporal/a;
    .locals 1

    sget-object v0, Lj$/time/temporal/a;->c:[Lj$/time/temporal/a;

    invoke-virtual {v0}, [Lj$/time/temporal/a;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lj$/time/temporal/a;

    return-object v0
.end method


# virtual methods
.method public final a(Lj$/time/temporal/k;)Z
    .locals 0

    invoke-interface {p1, p0}, Lj$/time/temporal/k;->b(Lj$/time/temporal/l;)Z

    move-result p1

    return p1
.end method

.method public final b(Lj$/time/temporal/k;)Lj$/time/temporal/q;
    .locals 0

    invoke-interface {p1, p0}, Lj$/time/temporal/k;->a(Lj$/time/temporal/l;)Lj$/time/temporal/q;

    move-result-object p1

    return-object p1
.end method

.method public final c()Z
    .locals 2

    invoke-virtual {p0}, Ljava/lang/Enum;->ordinal()I

    move-result v0

    sget-object v1, Lj$/time/temporal/a;->DAY_OF_WEEK:Lj$/time/temporal/a;

    invoke-virtual {v1}, Ljava/lang/Enum;->ordinal()I

    move-result v1

    if-lt v0, v1, :cond_0

    invoke-virtual {p0}, Ljava/lang/Enum;->ordinal()I

    move-result v0

    sget-object v1, Lj$/time/temporal/a;->ERA:Lj$/time/temporal/a;

    invoke-virtual {v1}, Ljava/lang/Enum;->ordinal()I

    move-result v1

    if-gt v0, v1, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public final d()Lj$/time/temporal/q;
    .locals 1

    iget-object v0, p0, Lj$/time/temporal/a;->b:Lj$/time/temporal/q;

    return-object v0
.end method

.method public final e()Z
    .locals 2

    invoke-virtual {p0}, Ljava/lang/Enum;->ordinal()I

    move-result v0

    sget-object v1, Lj$/time/temporal/a;->DAY_OF_WEEK:Lj$/time/temporal/a;

    invoke-virtual {v1}, Ljava/lang/Enum;->ordinal()I

    move-result v1

    if-ge v0, v1, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public final f(Lj$/time/temporal/k;)J
    .locals 2

    invoke-interface {p1, p0}, Lj$/time/temporal/k;->c(Lj$/time/temporal/l;)J

    move-result-wide v0

    return-wide v0
.end method

.method public final g(J)I
    .locals 1

    iget-object v0, p0, Lj$/time/temporal/a;->b:Lj$/time/temporal/q;

    invoke-virtual {v0, p1, p2, p0}, Lj$/time/temporal/q;->a(JLj$/time/temporal/l;)I

    move-result p1

    return p1
.end method

.method public final h(J)V
    .locals 1

    iget-object v0, p0, Lj$/time/temporal/a;->b:Lj$/time/temporal/q;

    invoke-virtual {v0, p1, p2, p0}, Lj$/time/temporal/q;->b(JLj$/time/temporal/l;)V

    return-void
.end method

.method public final toString()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lj$/time/temporal/a;->a:Ljava/lang/String;

    return-object v0
.end method
