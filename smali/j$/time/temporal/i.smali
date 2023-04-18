.class public abstract Lj$/time/temporal/i;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:Lj$/time/temporal/l;

.field public static final b:Lj$/time/temporal/l;

.field public static final c:Lj$/time/temporal/l;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    sget-object v0, Lj$/time/temporal/g;->DAY_OF_QUARTER:Lj$/time/temporal/g;

    sget-object v0, Lj$/time/temporal/g;->QUARTER_OF_YEAR:Lj$/time/temporal/g;

    sput-object v0, Lj$/time/temporal/i;->a:Lj$/time/temporal/l;

    sget-object v0, Lj$/time/temporal/g;->WEEK_OF_WEEK_BASED_YEAR:Lj$/time/temporal/g;

    sput-object v0, Lj$/time/temporal/i;->b:Lj$/time/temporal/l;

    sget-object v0, Lj$/time/temporal/g;->WEEK_BASED_YEAR:Lj$/time/temporal/g;

    sput-object v0, Lj$/time/temporal/i;->c:Lj$/time/temporal/l;

    sget-object v0, Lj$/time/temporal/h;->WEEK_BASED_YEARS:Lj$/time/temporal/h;

    sget-object v0, Lj$/time/temporal/h;->WEEK_BASED_YEARS:Lj$/time/temporal/h;

    return-void
.end method
