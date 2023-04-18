.class final Llf/l;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u0008\u00c2\u0002\u0018\u00002\u00020\u0001B\t\u0008\u0002\u00a2\u0006\u0004\u0008\u0004\u0010\u0005J\u0008\u0010\u0003\u001a\u00020\u0002H\u0007\u00a8\u0006\u0006"
    }
    d2 = {
        "Llf/l;",
        "",
        "Llf/k;",
        "a",
        "<init>",
        "()V",
        "kotlin-stdlib"
    }
    k = 0x1
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation


# static fields
.field public static final a:Llf/l;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Llf/l;

    invoke-direct {v0}, Llf/l;-><init>()V

    sput-object v0, Llf/l;->a:Llf/l;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static final a()Llf/k;
    .locals 4

    new-instance v0, Llf/k;

    const/16 v1, 0x8

    const/16 v2, 0xa

    const/4 v3, 0x1

    invoke-direct {v0, v3, v1, v2}, Llf/k;-><init>(III)V

    return-object v0
.end method
