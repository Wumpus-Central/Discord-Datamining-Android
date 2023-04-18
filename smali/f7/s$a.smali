.class public final Lf7/s$a;
.super Ljava/lang/Exception;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lf7/s;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation


# instance fields
.field public final k:Ld7/k;


# direct methods
.method public constructor <init>(Ljava/lang/String;Ld7/k;)V
    .locals 0

    .line 3
    invoke-direct {p0, p1}, Ljava/lang/Exception;-><init>(Ljava/lang/String;)V

    .line 4
    iput-object p2, p0, Lf7/s$a;->k:Ld7/k;

    return-void
.end method

.method public constructor <init>(Ljava/lang/Throwable;Ld7/k;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Ljava/lang/Exception;-><init>(Ljava/lang/Throwable;)V

    .line 2
    iput-object p2, p0, Lf7/s$a;->k:Ld7/k;

    return-void
.end method
