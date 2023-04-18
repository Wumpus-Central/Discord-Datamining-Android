.class public final Lf7/a$b;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lf7/a;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "b"
.end annotation


# instance fields
.field public final a:I

.field public final b:I

.field public final c:Ljava/lang/String;


# direct methods
.method private constructor <init>(IILjava/lang/String;)V
    .locals 0

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    iput p1, p0, Lf7/a$b;->a:I

    .line 4
    iput p2, p0, Lf7/a$b;->b:I

    .line 5
    iput-object p3, p0, Lf7/a$b;->c:Ljava/lang/String;

    return-void
.end method

.method synthetic constructor <init>(IILjava/lang/String;Lf7/a$a;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2, p3}, Lf7/a$b;-><init>(IILjava/lang/String;)V

    return-void
.end method
