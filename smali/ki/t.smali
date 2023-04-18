.class public abstract Lki/t;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lki/f;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lki/t$c;,
        Lki/t$d;,
        Lki/t$a;,
        Lki/t$b;
    }
.end annotation


# instance fields
.field private final a:Ljava/lang/String;


# direct methods
.method private constructor <init>(Ljava/lang/String;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lki/t;->a:Ljava/lang/String;

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/String;Lkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    invoke-direct {p0, p1}, Lki/t;-><init>(Ljava/lang/String;)V

    return-void
.end method


# virtual methods
.method public b(Lmg/y;)Ljava/lang/String;
    .locals 0

    invoke-static {p0, p1}, Lki/f$a;->a(Lki/f;Lmg/y;)Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method

.method public getDescription()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lki/t;->a:Ljava/lang/String;

    return-object v0
.end method
