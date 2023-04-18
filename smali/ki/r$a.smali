.class public final Lki/r$a;
.super Lki/r;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lki/r;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation


# static fields
.field public static final d:Lki/r$a;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lki/r$a;

    invoke-direct {v0}, Lki/r$a;-><init>()V

    sput-object v0, Lki/r$a;->d:Lki/r$a;

    return-void
.end method

.method private constructor <init>()V
    .locals 3

    sget-object v0, Lki/r$a$a;->k:Lki/r$a$a;

    const/4 v1, 0x0

    const-string v2, "Boolean"

    invoke-direct {p0, v2, v0, v1}, Lki/r;-><init>(Ljava/lang/String;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-void
.end method
