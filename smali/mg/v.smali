.class public final Lmg/v;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lmg/a$a;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lmg/a$a<",
        "Lmg/b;",
        ">;"
    }
.end annotation


# static fields
.field public static final a:Lmg/v;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lmg/v;

    invoke-direct {v0}, Lmg/v;-><init>()V

    sput-object v0, Lmg/v;->a:Lmg/v;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method
