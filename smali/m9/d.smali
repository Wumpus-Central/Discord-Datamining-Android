.class public final Lm9/d;
.super Ll9/a$a;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lm9/d$a;
    }
.end annotation

.annotation runtime Ljava/lang/Deprecated;
.end annotation


# static fields
.field public static final o:Lm9/d;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lm9/d$a;

    invoke-direct {v0}, Lm9/d$a;-><init>()V

    invoke-virtual {v0}, Lm9/d$a;->b()Lm9/d;

    move-result-object v0

    sput-object v0, Lm9/d;->o:Lm9/d;

    return-void
.end method

.method synthetic constructor <init>(Lm9/d$a;Lm9/e;)V
    .locals 0

    invoke-direct {p0, p1}, Ll9/a$a;-><init>(Ll9/a$a$a;)V

    return-void
.end method
