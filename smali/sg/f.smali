.class public abstract Lsg/f;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lch/b;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lsg/f$a;
    }
.end annotation


# static fields
.field public static final b:Lsg/f$a;


# instance fields
.field private final a:Llh/f;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lsg/f$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lsg/f$a;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lsg/f;->b:Lsg/f$a;

    return-void
.end method

.method private constructor <init>(Llh/f;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-object p1, p0, Lsg/f;->a:Llh/f;

    return-void
.end method

.method public synthetic constructor <init>(Llh/f;Lkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    invoke-direct {p0, p1}, Lsg/f;-><init>(Llh/f;)V

    return-void
.end method


# virtual methods
.method public getName()Llh/f;
    .locals 1

    iget-object v0, p0, Lsg/f;->a:Llh/f;

    return-object v0
.end method
