.class Lkotlin/jvm/internal/e$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/io/Serializable;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lkotlin/jvm/internal/e;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0xa
    name = "a"
.end annotation


# static fields
.field private static final k:Lkotlin/jvm/internal/e$a;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lkotlin/jvm/internal/e$a;

    invoke-direct {v0}, Lkotlin/jvm/internal/e$a;-><init>()V

    sput-object v0, Lkotlin/jvm/internal/e$a;->k:Lkotlin/jvm/internal/e$a;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method static synthetic a()Lkotlin/jvm/internal/e$a;
    .locals 1

    sget-object v0, Lkotlin/jvm/internal/e$a;->k:Lkotlin/jvm/internal/e$a;

    return-object v0
.end method
