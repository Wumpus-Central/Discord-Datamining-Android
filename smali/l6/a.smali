.class public Ll6/a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/io/Serializable;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Ljava/io/Serializable;"
    }
.end annotation


# static fields
.field public static final k:Lj6/c;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lj6/c;

    const-string v1, " "

    invoke-direct {v0, v1}, Lj6/c;-><init>(Ljava/lang/String;)V

    sput-object v0, Ll6/a;->k:Lj6/c;

    return-void
.end method
