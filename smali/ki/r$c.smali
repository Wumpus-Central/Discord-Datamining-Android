.class public final Lki/r$c;
.super Lki/r;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lki/r;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "c"
.end annotation


# static fields
.field public static final d:Lki/r$c;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lki/r$c;

    invoke-direct {v0}, Lki/r$c;-><init>()V

    sput-object v0, Lki/r$c;->d:Lki/r$c;

    return-void
.end method

.method private constructor <init>()V
    .locals 3

    sget-object v0, Lki/r$c$a;->k:Lki/r$c$a;

    const/4 v1, 0x0

    const-string v2, "Unit"

    invoke-direct {p0, v2, v0, v1}, Lki/r;-><init>(Ljava/lang/String;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-void
.end method
