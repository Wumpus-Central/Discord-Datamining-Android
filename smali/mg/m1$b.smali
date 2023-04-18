.class public final Lmg/m1$b;
.super Lmg/n1;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lmg/m1;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "b"
.end annotation


# static fields
.field public static final c:Lmg/m1$b;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lmg/m1$b;

    invoke-direct {v0}, Lmg/m1$b;-><init>()V

    sput-object v0, Lmg/m1$b;->c:Lmg/m1$b;

    return-void
.end method

.method private constructor <init>()V
    .locals 2

    .line 1
    const-string v0, "internal"

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-direct {p0, v0, v1}, Lmg/n1;-><init>(Ljava/lang/String;Z)V

    .line 5
    .line 6
    .line 7
    return-void
    .line 8
    .line 9
    .line 10
    .line 11
    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
    .line 24
.end method
