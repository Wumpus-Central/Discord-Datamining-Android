.class public final synthetic Ln7/a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ll7/a$d;


# instance fields
.field public final synthetic a:Ll7/s;


# direct methods
.method public synthetic constructor <init>(Ll7/s;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ln7/a;->a:Ll7/s;

    return-void
.end method


# virtual methods
.method public final a(J)J
    .locals 1

    iget-object v0, p0, Ln7/a;->a:Ll7/s;

    invoke-virtual {v0, p1, p2}, Ll7/s;->j(J)J

    move-result-wide p1

    return-wide p1
.end method
